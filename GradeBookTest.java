import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
    GradeBook grade1 = new GradeBook(5);
    GradeBook grade2 = new GradeBook(5);

    @BeforeEach
    void setUp() throws Exception {
        grade1.addScore(89.90);
        grade1.addScore(99.34);
        grade1.addScore(45.67);
        grade1.addScore(78.99);

        grade2.addScore(69.89);
        grade2.addScore(99.33);
        grade2.addScore(88.56);
        grade2.addScore(99.99);
    }

    @AfterEach
    void tearDown() throws Exception {
        grade1 = null;
        grade2 = null;
    }

    @Test
    void addScoreTest() {
 
        assertTrue(grade1.toString().equals(grade1.toString()));
        
        assertTrue(grade2.toString().equals(grade2.toString()));
        
        assertEquals(4, grade1.getScoreSize());
        assertEquals(4, grade2.getScoreSize());
    }

    @Test
    void testMinimum() {
        assertEquals(45.67, grade1.minimum(), 0.001);
        assertEquals(69.89, grade2.minimum(), 0.001);
    }

    @Test
    void testSum() {
        
        double expectedSumGrade1 = 89.90 + 99.34 + 45.67 + 78.99;
        assertEquals(expectedSumGrade1, grade1.sum(), 0.01); 
        
        double expectedSumGrade2 = 69.89 + 99.33 + 88.56 + 99.99;
        assertEquals(expectedSumGrade2, grade2.sum(), 0.01);
    }

    @Test
    void testFinalScore() {
        
        double expectedFinalScoreGrade1 = grade1.sum() - grade1.minimum();
        assertEquals(expectedFinalScoreGrade1, grade1.finalScore(), 0.01);

        
        double expectedFinalScoreGrade2 = grade2.sum() - grade2.minimum();
        assertEquals(expectedFinalScoreGrade2, grade2.finalScore(), 0.01);
    }
}