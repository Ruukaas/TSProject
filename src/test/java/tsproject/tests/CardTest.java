/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tsproject.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ifpe.tsproject.modelo.Card;
import com.ifpe.tsproject.repo.CardRepo;

/**
 *
 * @author ALUNO
 */
public class CardTest {
        

    @Test
    public void cardIsCorrectlyAdded() {
        Card card = new Card("546", "Credit", "564864548645", "ArthurMoraes", "5465192495765", "02/45");
        CardRepo repo = new CardRepo();

        Boolean added = repo.addCard(card);
        assertTrue(added);
    }

    @Test
    public void CardNotAddedIncorrectInfo() {
       Card card = new Card("5446", "Credit", "564864548645", "ArthurMoraes", "5465192495765", "02/45");
       
        CardRepo repo = new CardRepo();

        Boolean added = repo.addCard(card);
        assertFalse(added);
    }

    @Test
    public void CardNotAddedInvalidCard() {
       Card card = new Card("546", "Credit", "564864548645", "LucasHenrique", "5465192495765", "02/45");
       
        CardRepo repo = new CardRepo();

        Boolean added = repo.addCard(card);
        assertFalse(added);
    }

    @Test
    public void CardNotAddedWrongTypeCard() {
       Card card = new Card("546", "Debit", "564864548645", "LucasHenrique", "5465192495765", "02/45");
       
        CardRepo repo = new CardRepo();

        Boolean added = repo.addCard(card);
        assertFalse(added);
    }
    
    
    
    
}
