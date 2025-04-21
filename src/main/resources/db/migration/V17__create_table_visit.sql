CREATE TABLE visit (
  id UUID PRIMARY KEY,
  visitor_id UUID REFERENCES visitor(id),
  hospitalization_id UUID REFERENCES hospitalization(id),
  entry_time TIMESTAMP NOT NULL,
  exit_time TIMESTAMP,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
  updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);