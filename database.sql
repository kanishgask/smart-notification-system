CREATE TABLE Users (
    user_id INT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    phone VARCHAR(15)
);

CREATE TABLE Notifications (
    notification_id INT PRIMARY KEY,
    user_id INT,
    message TEXT,
    type VARCHAR(20),
    status VARCHAR(20),
    priority INT,
    FOREIGN KEY (user_id) REFERENCES Users(user_id)
);
