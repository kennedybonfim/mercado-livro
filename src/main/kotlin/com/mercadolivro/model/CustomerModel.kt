package com.mercadolivro.model

import com.mercadolivro.enums.CustomerStatus
import javax.persistence.*

@Entity(name = "customer")
@Table(name = "customer")
class CustomerModel(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int? = null,

    @Column
    var name: String,

    @Column
    var email: String,

    @Column
    @Enumerated(EnumType.STRING)
    var status: CustomerStatus
)