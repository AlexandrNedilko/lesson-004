/*"4. Correct nine classes: Worker (employee), Clerk (clerk), IT (IT specialist), Programmer (programmer), ProjectManager (project manager), CTO (CTO), HR (recruiter), OfficeManager (office manager), Cleaner (cleaner).
        Inherit a programmer, project manager and technical director from an IT specialist.
        Inherit the recruiter, cleaner and office manager from the clerk.
        Inherit the clerk and IT professional from the employee.*/
public class Task4 {
    public class Employee {
    }

    public class Worker {

    }

    public class Clerk extends Employee{

    }

    public class ITprofessional extends Employee {

    }

    public class Programmer extends ITprofessional{

    }

    public class ProjectManager extends ITprofessional {

    }

    public class CTO extends ITprofessional {

    }

    public class OfficeManager extends Clerk {

    }

    public class HR extends Clerk {

    }

    public class Cleaner extends Clerk{

    }
}
