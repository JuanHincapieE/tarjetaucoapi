package com.tarjetaucoapi.tarjetaucoapi.services.card;

import com.tarjetaucoapi.tarjetaucoapi.domains.card.Card;

import java.util.List;

public interface ICardService {

    List<Card> findAll();

    Card findById(int id);

    Card save(Card card);

    void delete(int id);
}
