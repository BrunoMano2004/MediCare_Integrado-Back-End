CREATE TABLE hospital (
  id UUID PRIMARY KEY,
  name VARCHAR(255) NOT NULL UNIQUE,
  cnpj VARCHAR(20) NOT NULL UNIQUE,
  phone VARCHAR(20),
  address_id UUID REFERENCES address(id),
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
  updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);