import java.util.ArrayList;
import java.util.List;

// Пример использования
    public class Main {
        public static void main(String[] args) {
            User user1 = new User("john", "john@example.com");
            User user2 = new User("alice", "alice@example.com");

            UserMapper userMapper = new UserMapper();

            userMapper.save(user1); // Сохранение пользователя 1 в базе данных
            userMapper.save(user2); // Сохранение пользователя 2 в базе данных

            User foundUser1 = userMapper.findByUsername("john"); // Поиск пользователя по имени
            System.out.println("Found user: " + foundUser1.getUsername() + ", " + foundUser1.getEmail());

            User foundUser2 = userMapper.findByUsername("jane");
            System.out.println("Found user: " + (foundUser2 != null ? foundUser2.getUsername() : "null"));

            user1.setEmail("newjohn@example.com"); // Изменение email пользователя 1
            userMapper.update(user1); // Обновление пользователя 1 в базе данных

            userMapper.delete(user2); // Удаление пользователя 2 из базы данных
        }
    }