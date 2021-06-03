package com.kremlev.wishlist.item;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/items")
public class ItemController {

    @GetMapping
    public List<Item> getAllItems() {
        return Arrays.asList(
                new Item(
                        1L,
                        "Apple Watch",
                        399,
                        "https://richmedia.ca-richimage.com/ImageDelivery/imageService?profileId=12026540&id=1603871&recipeId=729",
                        Type.THING
                ),new Item(
                        1L,
                        "Ticket to Hawaii",
                        445,
                        "https://imgc.allpostersimages.com/img/print/u-g-PT65VF0.jpg?w=550&h=550&p=0",
                        Type.TRAVEL_TICKET
                )
                );
    }
}
