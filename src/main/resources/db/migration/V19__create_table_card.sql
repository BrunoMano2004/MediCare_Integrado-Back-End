CREATE TABLE card (
  id UUID PRIMARY KEY,
  patient_id UUID REFERENCES patient(id),
  card_holder_name VARCHAR(255) NOT NULL,
  card_number VARCHAR(20) NOT NULL, -- armazenar tokenizado ou criptografado!
  expiration_month INT NOT NULL,
  expiration_year INT NOT NULL,
  card_brand VARCHAR(50) NOT NULL, -- ex: Visa, MasterCard, etc
  last_digits VARCHAR(4) NOT NULL,
  is_default BOOLEAN NOT NULL,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
  updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);