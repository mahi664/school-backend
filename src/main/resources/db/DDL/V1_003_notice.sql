CREATE TABLE school_backend.notice (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,

    title VARCHAR(255) NOT NULL,

    description TEXT,

    category VARCHAR(50) NOT NULL,

    important BOOLEAN DEFAULT FALSE,

    published BOOLEAN DEFAULT TRUE,

    expiry_date DATE,

    created_at TIMESTAMP NOT NULL
    DEFAULT CURRENT_TIMESTAMP,

    updated_at TIMESTAMP NOT NULL
    DEFAULT CURRENT_TIMESTAMP
    ON UPDATE CURRENT_TIMESTAMP
);


INSERT INTO school_backend.notice (
    title,
    description,
    category,
    important,
    published,
    expiry_date
)
VALUES
(
    'Admissions Open 2026-27',
    'Admissions are now open from Nursery to Standard 8th.',
    'ADMISSION',
    true,
    true,
    '2026-06-30'
),
(
    'Summer Vacation Notice',
    'School will remain closed for summer vacation.',
    'HOLIDAY',
    false,
    true,
    '2026-06-15'
),
(
    'Republic Day Celebration',
    'Republic Day celebration will be conducted in school campus.',
    'EVENT',
    false,
    true,
    '2026-01-26'
),
(
    'Unit Test Schedule',
    'Unit tests for all standards will begin next week.',
    'ACADEMIC',
    true,
    true,
    '2026-05-30'
);