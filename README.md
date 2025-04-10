# 🧠 Tổng Quan Về Design Patterns

Design Pattern (Mẫu thiết kế) là các giải pháp đã được chứng minh hiệu quả để giải quyết những vấn đề lặp đi lặp lại trong thiết kế phần mềm. Chúng không phải là đoạn mã cụ thể, mà là các **khuôn mẫu** giúp thiết kế phần mềm **linh hoạt, dễ bảo trì và mở rộng** hơn.

---

## 🏗️ Nhóm 1: Creational Patterns (Nhóm Khởi Tạo)

Các mẫu khởi tạo tập trung vào việc **tạo đối tượng một cách linh hoạt và hiệu quả**.

| Pattern | Mô Tả Ngắn |
|--------|------------|
| **Singleton** | Đảm bảo một lớp chỉ có duy nhất một thể hiện (instance) và cung cấp một điểm truy cập toàn cục. |
| **Factory Method** | Định nghĩa một interface để tạo object, nhưng cho phép các subclass quyết định lớp nào sẽ được tạo. |
| **Abstract Factory** | Cung cấp một giao diện để tạo các họ object liên quan mà không chỉ rõ lớp cụ thể. |
| **Builder** | Tách quá trình xây dựng object phức tạp ra khỏi biểu diễn của nó. |
| **Prototype** | Tạo đối tượng mới bằng cách sao chép một đối tượng hiện có (clone). |

---

## 🧩 Nhóm 2: Structural Patterns (Nhóm Cấu Trúc)

Các mẫu cấu trúc giúp **tổ chức các lớp và đối tượng** để hình thành cấu trúc lớn hơn.

| Pattern | Mô Tả Ngắn |
|--------|------------|
| **Adapter** | Biến đổi giao diện của một class thành giao diện khác mà client mong muốn. |
| **Bridge** | Tách abstraction và implementation để chúng có thể phát triển độc lập. |
| **Composite** | Dùng để biểu diễn cấu trúc cây (tree structure). Cho phép client xử lý đối tượng đơn lẻ và tổ hợp theo cách giống nhau. |
| **Decorator** | Thêm chức năng cho object một cách linh hoạt mà không thay đổi cấu trúc ban đầu. |
| **Facade** | Cung cấp một giao diện đơn giản cho hệ thống con phức tạp. |
| **Flyweight** | Tiết kiệm bộ nhớ bằng cách chia sẻ dữ liệu chung giữa nhiều object. |
| **Proxy** | Cung cấp một đối tượng thay thế để kiểm soát quyền truy cập đến object gốc. |

---

## 🔄 Nhóm 3: Behavioral Patterns (Nhóm Hành Vi)

Các mẫu hành vi tập trung vào **giao tiếp giữa các đối tượng**, giúp quản lý các thuật toán và luồng điều khiển.

| Pattern | Mô Tả Ngắn |
|--------|------------|
| **Observer** | Một object thay đổi sẽ tự động thông báo đến các object phụ thuộc. |
| **Strategy** | Cho phép thay đổi thuật toán thực thi tại runtime. |
| **Command** | Đóng gói yêu cầu dưới dạng object để có thể thực thi, lưu trữ, hoặc hoàn tác. |
| **Template Method** | Định nghĩa khung chương trình (skeleton) của thuật toán và cho phép subclass thay đổi các bước cụ thể. |
| **State** | Thay đổi hành vi của object dựa trên trạng thái nội tại của nó. |
| **Chain of Responsibility** | Truyền request qua một chuỗi các handler cho đến khi có handler xử lý. |
| **Mediator** | Đóng vai trò trung gian để giảm sự phụ thuộc trực tiếp giữa các object. |
| **Iterator** | Cung cấp cách truy cập tuần tự đến phần tử trong collection mà không cần biết cấu trúc nội bộ. |
| **Visitor** | Tách logic thao tác khỏi object, cho phép định nghĩa thêm hành vi mới mà không thay đổi lớp cũ. |
| **Memento** | Lưu và khôi phục trạng thái object mà không làm lộ chi tiết triển khai. |

---

## 📚 Tài Liệu Tham Khảo

- [Refactoring.Guru - Design Patterns](https://refactoring.guru/design-patterns)
- [Head First Design Patterns](https://www.oreilly.com/library/view/head-first-design/0596007124/)
- [Wikipedia - Software Design Pattern](https://en.wikipedia.org/wiki/Software_design_pattern)

---

## 🧑‍💻 Tác giả

> Repo này được tạo bởi [DucNhat03](https://github.com/DucNhat03) nhằm luyện tập các mẫu thiết kế phần mềm trong Java.

---

## 📞 Liên hệ

- 📧 Email: ducnhat0910@gmail.com  
- 📱 SĐT: 0386076296

