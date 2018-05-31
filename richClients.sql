CREATE USER 'richclients'@'localhost' IDENTIFIED BY 'richclients';
GRANT ALL PRIVILEGES ON richclients.* TO 'richclients'@'localhost';

CREATE DATABASE RichClients;
USE RichClients;

CREATE TABLE `event` (
  `eventId`     INT(11)     NOT NULL,
  `title`       VARCHAR(45) NOT NULL,
  `description` TEXT        NOT NULL,
  `organiser`   TEXT        NOT NULL,
  PRIMARY KEY (eventId)
);

INSERT INTO `event` (`eventId`, `title`, `description`, `organiser`) VALUES
(1, 'TestTitle', 'ThisIsTheDescription', 'TestOrganiser');

CREATE TABLE `reservation` (
  `reservationId` int(11) NOT NULL,
  `eventId` int(11) NOT NULL,
  `roomId` int(11) NOT NULL,
  `start` datetime NOT NULL,
  `end` datetime NOT NULL,
  PRIMARY KEY (reservationId),
  FOREIGN KEY (eventId) REFERENCES event(eventId),
  FOREIGN KEY (roomId) REFERENCES room(roomId)
);

CREATE TABLE `room` (
  `roomId`      INT(11)     NOT NULL,
  `name`        VARCHAR(45) NOT NULL,
  `description` TEXT        NOT NULL,
  PRIMARY KEY (roomId)
);