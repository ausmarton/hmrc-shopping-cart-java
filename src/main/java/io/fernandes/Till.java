package io.fernandes;

import java.util.List;

public interface Till {
    static double checkout(List<Item> cart) {
        return new NoOffer().apply(cart);
    }
}
