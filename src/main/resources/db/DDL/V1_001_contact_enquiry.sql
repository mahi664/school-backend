CREATE TABLE school_backend.contact_enquiry (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,

    parent_name VARCHAR(255) NOT NULL,

    phone_number VARCHAR(15) NOT NULL,

    student_standard VARCHAR(50),

    message VARCHAR(1000),

    status VARCHAR(50) NOT NULL,

    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
        ON UPDATE CURRENT_TIMESTAMP
);