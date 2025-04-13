-- 1. اختبار الإدخال الصحيح
INSERT IGNORE INTO users (full_name, email, phone_number, password)
VALUES ('Test User', 'testuser@example.com', '0123456789', 'password123');

-- 2. اختبار الـ UNIQUE Constraint (تكرار الإيميل)
INSERT IGNORE INTO users (full_name, email, phone_number, password)
VALUES ('Another User', 'testuser@example.com', '0987654321', 'newpassword123');

-- 3. اختبار NOT NULL Constraint (full_name ناقص)
INSERT IGNORE INTO users (email, phone_number, password)
VALUES ('nouser@example.com', '0123456789', 'password123');

-- 4. تحديث بيانات مستخدم
UPDATE users SET phone_number = '0101234567'
WHERE email = 'testuser@example.com';

SELECT * FROM users WHERE email = 'testuser@example.com';

-- 5. حذف المستخدم
DELETE FROM users WHERE email = 'testuser@example.com';
SELECT * FROM users WHERE email = 'testuser@example.com';

-- 6. اختبار PRIMARY KEY Constraint (id مكرر)
INSERT IGNORE INTO users (id, full_name, email, phone_number, password)
VALUES (1, 'User1', 'user1@example.com', '0123456789', 'password123');
INSERT IGNORE INTO users (id, full_name, email, phone_number, password)
VALUES (1, 'User2', 'user2@example.com', '0123456789', 'password123');

-- 7. اختبار FOREIGN KEY Constraint (user_id غير موجود)
INSERT IGNORE INTO booking (from_location, to_location, number_of_passengers, price_of_passenger, total_of_journey, user_id)
VALUES ('Cairo', 'Alexandria', 2, 100, 200, 999);

-- 8. قراءة بيانات المستخدم
SELECT * FROM users WHERE full_name = 'Test User';

-- 9. Integrity Test
SELECT * FROM booking b
LEFT JOIN users u ON b.user_id = u.id
WHERE u.id IS NULL;

-- 10. اختبار الأداء
SELECT * FROM users ORDER BY full_name LIMIT 1000;

-- 11. اختبار الأمان (محاكاة SQL Injection)
-- ملحوظة: الاستعلام التالي توضيحي، التنفيذ الفعلي يتم في كود الـ backend
SELECT * FROM users WHERE email = 'test@example.com' OR 1=1;

-- 12. اختبار الحذف والتراجع
START TRANSACTION;
DELETE FROM users WHERE email = 'testuser@example.com';
ROLLBACK;
SELECT * FROM users WHERE email = 'testuser@example.com';

-- 13. اختبار حدود البيانات (اسم طويل جدًا)
INSERT IGNORE INTO users (full_name, email, phone_number, password)
VALUES (REPEAT('A', 200), 'longname@example.com', '0123456789', 'password123');
