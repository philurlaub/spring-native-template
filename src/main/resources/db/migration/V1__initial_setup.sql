CREATE TABLE IF NOT EXISTS "metadata" (
    "dataset_id" uuid NOT NULL PRIMARY KEY,
    "dataset_name" VARCHAR(255),
    "dataset_type" VARCHAR(255)
);