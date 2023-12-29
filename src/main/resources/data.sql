INSERT INTO users (email, name, password, role) VALUES
    -- admin@admin.com / admin
    ('admin@admin.com', 'Administrator', '$2a$10$b0ZQzE.SGKoni4RaQ6Hut.7QBzQHHswK8GKNJHCxZvR2W7OcrZErG', 'ADMIN'),
    -- kluge.radoslaw@gmail.com / pass123
    ('kluge.radoslaw@gmail.com', 'Radosław Kluge', '$2a$10$qqzCu4GlWFa.9WBLURs8YOWUR.mRKHbSsD8piMoaBqCB.VS.wKSRC', 'USER'),
    -- test@test.com / 1234
    ('test@test.com', 'Tester','$2a$10$If85EGk6daM8ZbwMjLRLweeJbVHL6mLQypWWTrWtGEmPhrtuQ9psK', 'USER');

