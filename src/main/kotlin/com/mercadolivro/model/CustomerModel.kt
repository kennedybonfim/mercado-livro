package com.mercadolivro.model

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
    var email: String
)