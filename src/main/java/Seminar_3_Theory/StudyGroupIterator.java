package Seminar_3_Theory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class StudyGroupIterator implements Iterator<Student> {

    private List<Student> studentsGroup;

    private int index;

    public StudyGroupIterator(StudentGroup studentsGroup) {
        this.studentsGroup = studentsGroup.getStudentGroup();
        this.index = -1;
    }

    @Override
    public boolean hasNext() {
        return index < studentsGroup.size()-1 ;
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            return null;
        }
        return studentsGroup.get(++index);
    }

    @Override
    public void remove() {
        if (index >= 0 && index < studentsGroup.size()) {
            studentsGroup.remove(index);
        }
    }

}