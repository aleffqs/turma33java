create database db_jogo_gen33;

use db_jogo_gen33;

create table tb_classe(
	id bigint auto_increment,
    nome varchar(255),
    poder varchar(255),
    energia int,
    
    primary key (id)
);

insert into tb_classe(nome, poder, energia) values ("maga", "bola de fogo", 90);
insert into tb_classe(nome, poder, energia) values ("arqueira", "chuva de flechas", 100);
insert into tb_classe(nome, poder, energia) values ("sereia", "agua transbordante", 120);
insert into tb_classe(nome, poder, energia) values ("morte", "sugadora de almas", 150);

select * from tb_classe;

create table tb_personagem(
	id bigint auto_increment,
    nome varchar(20),
    genero varchar(20),
    raça varchar(20),
    ataque int,
    vida int,
    fk_id_classe bigint,
    
    primary key (id),
    foreign key (fk_id_classe) references tb_classe(id)
    
);

insert into tb_personagem (nome, genero, raça, ataque, vida, fk_id_classe)
	values ("Gustavo", "ele", "Jacaré", 20, 150, 1);
insert into tb_personagem (nome, genero, raça, ataque, vida, fk_id_classe)
	values ("Joice", "ela", "humana", 20, 150, 3);
insert into tb_personagem (nome, genero, raça, ataque, vida, fk_id_classe)
	values ("Juan", "elu", "bullywug", 8, 50, 4);
insert into tb_personagem (nome, genero, raça, ataque, vida, fk_id_classe)
	values ("Raniere", "Menine", "humana", 22, 100, 2);
    
select * from tb_personagem;

select * from tb_personagem where ataque > 10;

select * from tb_personagem where vida between 40 and 101;

select * from tb_personagem where nome like "%j%";

select * from tb_personagem inner join tb_classe
	on tb_classe.id = tb_personagem.fk_id_classe;
    
select * from tb_personagem inner join tb_classe on tb_classe.id = tb_personagem.fk_id_classe where fk_id_classe = 2
