public class StudentServiceImp implements StudentService{
    @Autowired
    StudentRepository repo;

    @override
    public Student createData(Studentstu){
        return repo.save(stu);
    }
    @override
}