CREATE TABLE produto (
    id SERIAL PRIMARY KEY,
    descricao VARCHAR(255) NOT NULL,
    categoria VARCHAR(100) NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
    quantidade_estoque INT NOT NULL,
    unidade_medida VARCHAR(50) NOT NULL,
    codigo_barras VARCHAR(50) UNIQUE NOT NULL,
    fornecedor VARCHAR(255) NOT NULL
);
