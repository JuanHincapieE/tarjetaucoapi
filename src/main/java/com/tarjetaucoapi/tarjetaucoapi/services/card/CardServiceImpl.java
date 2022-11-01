package com.tarjetaucoapi.tarjetaucoapi.services.card;

import org.springframework.transaction.annotation.Transactional;
import com.tarjetaucoapi.tarjetaucoapi.domains.card.Card;
import com.tarjetaucoapi.tarjetaucoapi.repositories.card.ICardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements ICardService {

    @Autowired
    private ICardRepository cardRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Card> findAll() {
        return (List<Card>) cardRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Card findById(int id) {
        return cardRepository.findById(id).orElse(null);
    }
    @Override
    @Transactional
    public Card save(Card card) {
        return cardRepository.save(card);
    }
    @Override
    @Transactional
    public void delete(int id) {
        cardRepository.deleteById(id);
    }

}
