CREATE TABLE school_backend.school_config (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,

    school_name VARCHAR(255) NOT NULL,

    phone_number VARCHAR(20),

    email VARCHAR(255),

    address VARCHAR(1000),

    principal_message TEXT,

    youtube_url VARCHAR(500),

    facebook_url VARCHAR(500),

    instagram_url VARCHAR(500),

    admission_open BOOLEAN DEFAULT TRUE,

    school_timing VARCHAR(255),

    current_academic_year VARCHAR(50),

    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
    ON UPDATE CURRENT_TIMESTAMP
);


INSERT INTO school_config (
    school_name,
    phone_number,
    email,
    address,
    principal_message,
    youtube_url,
    admission_open,
    school_timing,
    current_academic_year
)
VALUES (
    'Nathsagar English Medium School',
    '9876543210',
    'info@nemsghotan.com',
    'Ghotan, Maharashtra',
    'Welcome to our school...',
    'https://youtube.com',
    true,
    '9 AM - 4 PM',
    '2025-26'
);

