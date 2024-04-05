package com.allali.Stock.entitie;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("CLI")
@Data
@AllArgsConstructor @NoArgsConstructor

public class Client extends Users {

    @OneToMany(mappedBy = "client" , fetch = FetchType.LAZY)
    private List<Transition> transitionList = new ArrayList<>() ;
}
