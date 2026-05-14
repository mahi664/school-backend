CREATE TABLE school_backend.gallery (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,

    title VARCHAR(255) NOT NULL,

    image_url VARCHAR(1000),

    category VARCHAR(50) NOT NULL,

    featured BOOLEAN DEFAULT FALSE,

    youtube_link VARCHAR(1000),

    display_order INT DEFAULT 0,

    published BOOLEAN DEFAULT TRUE,

    created_at TIMESTAMP NOT NULL
    DEFAULT CURRENT_TIMESTAMP,

    updated_at TIMESTAMP NOT NULL
    DEFAULT CURRENT_TIMESTAMP
    ON UPDATE CURRENT_TIMESTAMP
);

INSERT INTO gallery (
    title,
    image_url,
    category,
    featured,
    youtube_link,
    display_order,
    published
)
VALUES
(
    'Annual Day Celebration',
    'https://images.unsplash.com/photo-1509062522246-3755977927d7',
    'EVENT',
    true,
    null,
    1,
    true
),
(
    'Sports Day',
    'https://images.unsplash.com/photo-1544717305-2782549b5136',
    'SPORTS',
    true,
    null,
    2,
    true
),
(
    'Science Exhibition',
    'https://images.unsplash.com/photo-1503676260728-1c00da094a0b',
    'ACADEMIC',
    false,
    null,
    3,
    true
),
(
    'School Tour Video',
    null,
    'EVENT',
    true,
    'https://www.youtube.com/watch?v=dQw4w9WgXcQ',
    4,
    true
);