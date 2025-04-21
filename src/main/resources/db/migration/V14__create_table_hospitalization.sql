CREATE TABLE hospitalization (
  id UUID PRIMARY KEY,
  admission_date TIMESTAMP NOT NULL,
  discharge_date TIMESTAMP,
  patient_id UUID REFERENCES patient(id),
  doctor_id UUID REFERENCES doctor(id),
  bed_id UUID REFERENCES bed(id),
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
  updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);