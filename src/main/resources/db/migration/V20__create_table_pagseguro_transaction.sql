CREATE TABLE pagseguro_transaction (
  id UUID PRIMARY KEY,
  payment_id UUID REFERENCES payment(id),
  transaction_code VARCHAR(255) NOT NULL, -- Código da transação gerado pelo PagSeguro
  status VARCHAR(20) NOT NULL, -- Status da transação no PagSeguro (ex: "approved", "in_process")
  payment_date TIMESTAMP NOT NULL, -- Data da transação
  transaction_url TEXT, -- URL para detalhes da transação no PagSeguro
  payment_method VARCHAR(50), -- Método de pagamento (ex: Cartão de crédito, Boleto, etc)
  installment_count INT, -- Número de parcelas, se houver
  gross_amount DECIMAL(10,2) NOT NULL, -- Valor bruto da transação
  fee_amount DECIMAL(10,2), -- Taxa aplicada pelo PagSeguro
  net_amount DECIMAL(10,2), -- Valor líquido recebido após taxas
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
  updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);