CREATE TABLE cadastro_navio (id_navio SERIAL PRIMARY KEY, 
nome_navio VARCHAR(50), 
empresa_proprietaria VARCHAR(50),
id_empresa_proprietaria BIGINT,
cnpj_empr_proprietaria BIGINT,
pais_origem_empresa_proprietaria VARCHAR(60),
cod_pais SMALLINT,
categoria_navio TINYINT,
descricao_categoria_navio VARCHAR(255),
origem_navio VARCHAR(60),
destino_navio VARCHAR(60)
);