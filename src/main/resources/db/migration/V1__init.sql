CREATE TABLE Autor
(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255)
);

CREATE TABLE Artigo
(
    id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    imageUrl VARCHAR(255),
    autorId INT,
    FOREIGN KEY(autorId) references Autor(id)
);