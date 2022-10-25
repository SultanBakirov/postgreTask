public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        create database postgre_task;
//        create table World(
//                id serial primary key,
//                name varchar(255),
//                continent varchar(255),
//                area int,
//        population int
//);
//
//        insert into World(name, continent, area, population)
//        VALUES ('Afghanistan', 'Asia', 652230, 25500100),
//                ('Albania','Europe', 28748, 2831741),
//        ('Algeria','Africa', 28748, 2831741),
//        ('Andorra','Europe', 28748, 2831741),
//        ('Angola','Europe', 28748, 2831741);
//
//        select * from World where area > 300000  and population > 25000000;
//        select max(area), name, continent from World group by name, continent;
//
//        create table Person(
//                id int,
//        email varchar
//);
//
//        drop table Person;
//        insert into Person
//                VALUES
//        (1, 'a@b.com'),
//        (2, 'c@d.com'),
//        (3, 'a@b.com'),
//        (4, 'c@d.com'),
//        (5, 'd@b.com');
//
//        select email from Person group by email;
//
//        create table people (
//                id INT,
//                first_name VARCHAR(50),
//                last_name VARCHAR(50),
//                email VARCHAR(50),
//                gender VARCHAR(50),
//                birth_date DATE,
//                country VARCHAR(50),
//                salary int
//);
//        insert into people (id, first_name, last_name, email, gender, birth_date, country, salary)
//        values (1, 'Natalina', 'Ost', 'nost0@engadget.com', 'Female', '4/2/1994', 'Denmark',15000),
//                (2, 'Lu', 'Freathy', 'lfreathy1@vistaprint.com', 'Female', '12/12/1998', 'Brazil',45000),
//        (3, 'Mohandas', 'Mowsley', 'mmowsley2@xinhuanet.com', 'Male', '5/19/2001',
//                'Israel',95000),
//        (4, 'Emmalynn', 'Culshew', 'eculshew3@webmd.com', 'Female', '8/29/1994',
//                'Thailand',16000),
//        (5, 'Arty', 'Wipfler', 'awipfler4@yandex.ru', 'Male', '2/19/2000', 'Thailand',17000),
//        (6, 'Velma', 'Luberto', 'vluberto5@nbcnews.com', 'Female', '5/30/2011', 'China',19000),
//        (7, 'Alfred', 'Dunan', 'adunan6@intel.com', 'Female', '10/3/2014', 'Sri Lanka',23000),
//        (8, 'Avrom', 'Searby', 'asearby7@yahoo.com', 'Male', '3/30/1998', 'Brunei',193999),
//        (9, 'Libbey', 'Iacobetto', 'liacobetto8@dagondesign.com', 'Female', '11/1/2017',
//                'China',110003),
//        (10, 'Cleon', 'Heindrick', 'cheindrick9@time.com', 'Female', '6/10/2019', 'China', 45678),
//        (11, 'Donna', 'Calderonello', 'dcalderonelloa@unesco.org', 'Female', '6/28/2010',
//                'Philippines',44440),
//        (12, 'Jewelle', 'Bonds', 'jbondsb@ucla.edu', 'Female', '11/8/1994', 'Poland',30000),
//        (13, 'Dimitri', 'Hane', 'dhanec@ucsd.edu', 'Male', '9/6/1991', 'Argentina',18000),
//        (14, 'Vassili', 'Poschel', 'vposcheld@boston.com', 'Male', '4/15/2000', 'France',400000),
//        (15, 'Donna', 'Skivington', 'dskivingtone@cdbaby.com', 'Female', '11/5/1997',
//                'France',499930),
//        (16, 'Libbi', 'Grahlman', 'lgrahlmanf@com.com', 'Female', '1/23/2006', 'Vietnam',3243289),
//        (17, 'Liane', 'Prawle', 'lprawleg@irs.gov', 'Female', '8/18/2009', 'Sweden',4324320),
//        (18, 'Dedra', 'Camp', 'dcamph@unc.edu', 'Female', '9/22/1998', 'China', 88439),
//        (19, 'Carolyn', 'Ceschelli', 'cceschellii@ovh.net', 'Female', '8/6/2007', 'Argentina',99909),
//        (20, 'Blithe', 'Benkin', 'bbenkinj@spiegel.de', 'Female', '3/10/2008', 'Brazil',130000),
//        (21, 'Nolan', 'Shafe', 'nshafek@joomla.org', 'Male', '8/22/2018', 'Tajikistan',456789),
//        (22, 'Wald', 'Abramzon', 'wabramzonl@homestead.com', 'Male', '10/4/1998',
//                'Philippines',99003);
//
//        select id, first_name, gender, birth_date from people where birth_date
//        between '1999-01-01' and '2008-12-31' order by birth_date desc;
//        select count(*) from people where birth_date between '1999-01-01' and '2008-12-31';
//        select count(gender) as female from people where gender = 'Female';
//        select count(gender) as male from people where gender = 'Male';
//        select * from people where first_name like 'A%';
//        alter table person add constraint person_ung unique(id);
//        alter table people rename column birth_date to birth;

    }
}