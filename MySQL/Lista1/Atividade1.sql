/*Atividade 1
Crie um banco de dados para um serviço de RH de uma empresa, onde o sistema
trabalhará com as informações dos funcionaries desta empresa.
Crie uma tabela de funcionaries e utilizando a habilidade de abstração e determine 5
atributos relevantes dos funcionaries para se trabalhar com o serviço deste RH.
Popule esta tabela com até 5 dados;
Faça um select que retorne os funcionaries com o salário maior do que 2000.
Faça um select que retorne os funcionaries com o salário menor do que 2000.
Ao término atualize um dado desta tabela através de uma query de atualização.
salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade.*/

create table tb_funcionarios (
	id bigint(5) auto_increment,
	nome_func varchar(20),
    salario decimal(10,2),
    cargo varchar(20) not null,
    ativo boolean not null,
    
    primary key(id)
);

insert into tb_funcionaries(nome_func, salario, cargo, ativo) values ("Renan", 5000.00, "Dev FullStack Jr", true);
insert into tb_funcionaries(nome_func, salario, cargo, ativo) values ("Joana", 7000.00, "Dev FullStack Pl", true);
insert into tb_funcionaries(nome_func, salario, cargo, ativo) values ("Pedro", 2000.00, "Atendente", true);
insert into tb_funcionaries(nome_func, salario, cargo, ativo) values ("João", 3400.00, "Analista", true);
insert into tb_funcionaries(nome_func, salario, cargo, ativo) values ("Rita", 10000.00, "Product owner", true);

select * from tb_funcionaries;
select * from tb_funcionaries where salario > 2000;
select * from tb_funcionaries where salario <= 2000;

update tb_funcionaries set nome_func = "Pedro DESLIGADO", salario = 0.00, ativo = false where id = 3;

select * from tb_funcionaries