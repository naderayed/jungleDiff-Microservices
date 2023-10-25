package com.junglediff.claims.entities;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long claimId;
    String claimTitle;
    String claimDesc;
    Date creationDate;
    String claimImage;
}
