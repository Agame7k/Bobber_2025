package frc.robot.commands.tilt;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants;
import frc.robot.subsystems.Tilt;

public class Tilt_Position extends Command {
    private Tilt m_tilt;
    private double position;

    public Tilt_Position(Tilt tilt, double position) {
        addRequirements(tilt);
        this.m_tilt = tilt;
        this.position = position;
    }

    @Override
    public void initialize() {
        this.m_tilt.setAngle(this.position);
    }
    
    @Override
    public void execute() {
        System.out.println(m_tilt.getPosition());
    }

    @Override
    public void end(boolean interrupted) {
        m_tilt.setAngle(Constants.FISHHOOK_IN);
        System.out.println("set back to 0");
    }

    public boolean isFinished() {
        return true;
    }

}