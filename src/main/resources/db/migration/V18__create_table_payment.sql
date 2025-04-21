CREATE TABLE payment (
  id UUID PRIMARY KEY,
  amount DECIMAL(10,2) NOT NULL,
  method VARCHAR(20) NOT NULL, -- ENUM('CASH', 'CREDIT', 'DEBIT', 'PIX', 'INSURANCE')
  datetime TIMESTAMP NOT NULL,
  description TEXT,
  patient_id UUID REFERENCES patient(id),
  status VARCHAR(20) NOT NULL, -- ENUM('PENDING', 'COMPLETED', 'FAILED', 'CANCELLED')
  transaction_code VARCHAR(255), -- Código da transação no PagSeguro
  pagseguro_payment_url TEXT, -- URL do PagSeguro para o pagamento, se aplicável (ex: para pagamento via boleto)
  pagseguro_checkout_url TEXT, -- URL do checkout do PagSeguro para redirecionamento
  payment_method_details JSONB, -- Detalhes do método de pagamento, como bandeira do cartão, últimos 4 dígitos, etc
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
  updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);