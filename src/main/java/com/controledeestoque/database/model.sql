drop database db_controleestoque;
create database db_controleestoque;
use db_controleestoque;

############# Construindo as tabelas

create table tbl_marca (
	id int not null auto_increment unique,
    marca varchar(45),
    primary key (id)
);

create table tbl_modelo (
	id int not null auto_increment unique,
    modelo varchar(45),
    primary key (id)
);

create table tbl_tipo (
	id int not null auto_increment unique,
    tipo varchar(45),
    primary key (id)
);

create table tbl_situacao (
	id int not null auto_increment unique,
    situacao varchar(45),
    primary key (id)
);

create table tbl_veiculo (
	id int not null auto_increment,
	marca_id int not null,
    modelo_id int not null,
    tipo_id int not null,
    cor varchar(45) not null,
    quilometragem long not null,
    ano_fabricacao int not null,
    preco float not null,
    situacao_id int not null,
    primary key (id),
    constraint fk_veiculo_marca foreign key (marca_id) references tbl_marca(id),
    constraint fk_veiculo_modelo foreign key (modelo_id) references tbl_modelo(id),
    constraint fk_veiculo_tipo foreign key (tipo_id) references tbl_tipo(id),
    constraint fk_veiculo_situacao foreign key (situacao_id) references tbl_situacao(id)
    );

############# Populando as tabelas

insert into tbl_marca (marca) values ('Ford'), ('Chevrolet'), ('Fiat'), ('Renault'), ('Peugeot'), ('Citroen'), ('Toyota');
insert into tbl_modelo (modelo) values ('Fiesta'), ('Onix'), ('Fiorino'), ('Sandero'), ('307'), ('Xsara'), ('Corolla');
insert into tbl_tipo (tipo) values ('Hatch'), ('Sedan'), ('Picape'), ('Furgão'), ('SUV');
insert into tbl_situacao (situacao) values ('Disponível'), ('Indisponível'), ('Vendido');

insert into tbl_veiculo (marca_id, modelo_id, tipo_id, cor, quilometragem, ano_fabricacao, preco, situacao_id) values
	(1, 1, 2, 'Azul', 113673, 2013, 33500.00, 1),
    (2, 2, 2, 'Verde', 46872, 2022, 66800.00, 1),
    (7, 7, 2, 'Azul Marinho', 156874, 1997, 22300.00, 1)
;

############# Visualizando as tabelas

select * from tbl_marca;
select * from tbl_modelo;
select * from tbl_tipo;
select * from tbl_situacao;
select * from tbl_veiculo;