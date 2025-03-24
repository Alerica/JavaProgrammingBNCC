package pacpac;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class CardGame {
    class Card {
        String cardName;
        ImageIcon cardImageIcon;
        
        Card(String cardName, ImageIcon cardImageIcon) {
            this.cardName = cardName;
            this.cardImageIcon = cardImageIcon;
        }
        
        public String toString() {
            return cardName;
        }
    }
    
    String[] cardList = Game.CARD_LIST;
    
    int rows = Game.ROWS;
    int columns = Game.COLUMNS;
    int cardWidth = Game.CARD_WIDTH;
    int cardHeight = Game.CARD_HEIGHT;
    
    ArrayList<Card> cardSet;
    ImageIcon cardBackImageIcon;
    
    int boardWidth = Game.BOARD_WIDTH;
    int boardHeight = Game.BOARD_HEIGHT;
    
    JFrame frame = new JFrame("Cards Game");
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();
    int mistakeCount;
    
    JPanel boardPanel = new JPanel();
    ArrayList<JButton> cards;
    
    JPanel restartGamePanel = new JPanel();
    JButton restartButton = new JButton();
    
    Timer hideCardTimer;
    boolean startGame = false;
    
    JButton cardSelected1;
    JButton cardSelected2;
    
    CardGame() {
        setupCards();
        shuffleCards();
        
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        textLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setText("Mistakes: " + Integer.toString(mistakeCount));
        
        textPanel.setPreferredSize(new Dimension(boardWidth, 30));
        textPanel.setBackground(Color.red);
        textPanel.add(textLabel);
        frame.add(textPanel, BorderLayout.NORTH);
        
        cards = new ArrayList<JButton>();
        boardPanel.setLayout(new GridLayout(rows, columns));
        
        
        for (int i = 0; i < cardSet.size(); i++) {
            JButton card = new JButton();
            card.setPreferredSize(new Dimension(cardWidth, cardHeight));
            card.setOpaque(true);
            card.setIcon(cardSet.get(i).cardImageIcon);
            card.setFocusable(false);
            card.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(!startGame) return;
                    
                    JButton card = (JButton) e.getSource();
                    if(card.getIcon() == cardBackImageIcon) {
                        if(cardSelected1 == null) {
                            cardSelected1 = card;
                            int index = cards.indexOf(cardSelected1);
                            cardSelected1.setIcon(cardSet.get(index).cardImageIcon);
                        }
                        else if (cardSelected2 == null) {
                            cardSelected2 = card;
                            int index = cards.indexOf(cardSelected2);
                            cardSelected2.setIcon(cardSet.get(index).cardImageIcon);
                            
                            if(cardSelected1.getIcon() != cardSelected2.getIcon()) {
                                mistakeCount += 1;
                                textLabel.setText("Mistake: " + Integer.toString(mistakeCount));
                                hideCardTimer.start();
                            } else {
                                cardSelected1 = null;
                                cardSelected2 = null;
                                       
                            }
                        }
                    }
                }    
            });
            cards.add(card);
            boardPanel.add(card);
        }
        
        frame.add(boardPanel);
        
        restartButton.setFont(new Font("Arial", Font.PLAIN, 20));
        restartButton.setText("Restart Game");
        restartButton.setPreferredSize(new Dimension(boardWidth, 30));
        restartButton.setFocusable(false);
        restartButton.setEnabled(false);
        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                restartGame();
            }
        
        });
        restartGamePanel.add(restartButton);
        frame.add(restartGamePanel, BorderLayout.SOUTH);
        
        frame.pack();
        
        hideCardTimer = new Timer(Game.TIMER_DURATION, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hideCards();
            }
        });
        
        hideCardTimer.setRepeats(false);
        hideCardTimer.start();
    }
    
    void setupCards() {
        cardSet = new ArrayList<Card>();
        for(String cardName: cardList) {
            Image cardImage = new ImageIcon(getClass().getResource("./cards/" + cardName + ".png")).getImage();
            ImageIcon cardImageIcon = new ImageIcon(cardImage.getScaledInstance(cardWidth, cardHeight, java.awt.Image.SCALE_SMOOTH));
        
            Card card = new Card(cardName, cardImageIcon);
            cardSet.add(card);
        }
        cardSet.addAll(cardSet);
        
        Image cardBackImage = new ImageIcon(getClass().getResource("./cards/Back.png")).getImage();
        cardBackImageIcon = new ImageIcon(cardBackImage.getScaledInstance(cardWidth, cardHeight, java.awt.Image.SCALE_SMOOTH));
    }
    
    void shuffleCards() {
        System.out.println(cardSet);
        for (int i = 0; i < cardSet.size(); i++) {
            int rand = (int) (Math.random() * cardSet.size());
            Card temp = cardSet.get(i);
            cardSet.set(i, cardSet.get(rand));
            cardSet.set(rand, temp);
        }
        System.out.println(cardSet);
    }
    
    void hideCards() {
        if(startGame && cardSelected1 != null && cardSelected2 != null) {
            cardSelected1.setIcon(cardBackImageIcon);
            cardSelected2.setIcon(cardBackImageIcon);
            cardSelected1 = null;
            cardSelected2 = null;
        } else {
            for(int i = 0; i < cardSet.size(); i++) {
                cards.get(i).setIcon(cardBackImageIcon);
            }
            startGame = true;
            restartButton.setEnabled(true);
        }
    }
    
    void restartGame() {
        if(!startGame) return;

        startGame = false;
        restartButton.setEnabled(false);
        cardSelected1 = null;
        cardSelected2 = null;
        shuffleCards();

        for(int i = 0; i < cards.size(); i++) {
            cards.get(i).setIcon(cardSet.get(i).cardImageIcon);
        }

        mistakeCount = 0;
        textLabel.setText("Mistake: " + Integer.toString(mistakeCount));
        hideCardTimer.start();  
    }
    
}
