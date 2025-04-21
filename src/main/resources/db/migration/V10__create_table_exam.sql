CREATE TABLE exam (
  id UUID PRIMARY KEY,
  exam_type_id UUID REFERENCES exam_type(id),
  doctor_id UUID REFERENCES doctor(id),
  hospital_id UUID REFERENCES hospital(id),
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
  updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);