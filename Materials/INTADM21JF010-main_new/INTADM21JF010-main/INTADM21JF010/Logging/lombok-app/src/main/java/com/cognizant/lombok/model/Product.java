package com.cognizant.lombok.model;

import lombok.*;
/*
@Getter
@Setter
@ToString
@EqualsAndHashCode
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class Product {
 private @NonNull Long productId;
 private @NonNull String productName;
 private Float productPrice;
}
