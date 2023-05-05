package com.devsuperior.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity // Configura a equivalencia na tabela
@Table(name = "tb_product") // Cria e nomeia a tabela
public class Product {

    @Id // Configura a chave primara do banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Configura para o banco ser auto incrementável
    private Long id;
    private String name;
    private Double price;

    @ManyToOne // Cria o mapeamento objeto relacional
    @JoinColumn(name = "department_id") // Configura o nome da chave estrangeira para o relacionamento das tabelas
    private Department department;

    public Product() {

    }

    public Product(Long id, String name, Double price, Department department) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
