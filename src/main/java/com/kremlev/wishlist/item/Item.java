package com.kremlev.wishlist.item;

import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Item {
    private Long id;
    private String name;
    private Integer price;
    private String image;
    private Type type;
}
