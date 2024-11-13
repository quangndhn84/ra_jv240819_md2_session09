package generic;

import java.util.List;

public class StudentManagement implements IApp<Student>{
    @Override
    public List<Student> findAll() {
        return List.of();
    }

    @Override
    public boolean create(Student obj) {
        return false;
    }

    @Override
    public boolean update(Student obj) {
        return false;
    }

    @Override
    public boolean delete(Student obj) {
        return false;
    }
}
