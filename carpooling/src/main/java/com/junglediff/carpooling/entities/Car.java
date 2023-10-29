package com.junglediff.carpooling.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long carId;
    @Enumerated(EnumType.STRING)
    enum_car type;
    Date creationDate;

}
