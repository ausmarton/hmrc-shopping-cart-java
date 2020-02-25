package io.fernandes;

import java.util.List;
import java.util.stream.Collectors;

public class NoOffer {
    public double apply(List<Item> items) {
        return items.stream().map(Item::getPrice).reduce(Double::sum).orElse(0.0);
    }
}