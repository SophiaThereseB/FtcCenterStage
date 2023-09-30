package org.firstinspires.ftc.teamcode.auto.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.common.RobotConstants;
import org.firstinspires.ftc.teamcode.common.RobotConstantsCenterStage;

@Autonomous(name = "AutoNoDriveRED", group = "TeamCode")
@Disabled
public class AutoNoDriveRED extends LinearOpMode {
    public void runOpMode() throws InterruptedException {
        FTCAutoDispatch.runAuto(RobotConstants.RunType.AUTO_NO_DRIVE,
                RobotConstantsCenterStage.OpMode.AUTO_NO_DRIVE, RobotConstants.Alliance.RED, this);
    }
}
