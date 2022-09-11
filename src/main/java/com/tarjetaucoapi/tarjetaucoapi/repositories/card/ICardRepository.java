package com.tarjetaucoapi.tarjetaucoapi.repositories.card;

import com.tarjetaucoapi.tarjetaucoapi.domains.card.Card;
import org.springframework.data.repository.CrudRepository;

public interface ICardRepository extends CrudRepository<Card, Integer> {
}
