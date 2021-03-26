package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Light;

public class LightToggle extends CommandBase {

    private final Light m_light;

    public LightToggle(Light subsystem) {
        m_light = subsystem;
        addRequirements(m_light);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        m_light.toggleLight();
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return true;
    }

    @Override
    public boolean runsWhenDisabled() {
        return false;
    }
}
