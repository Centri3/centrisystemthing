Planet	"Don/Lercurnis II"
{
	ParentBody     "Fragmunt-Kond bar"
	Class          "Jupiter"
	Mass            9.55
	Radius          1.84e+04
	InertiaMoment   0.239
	RotationPeriod  67.5
	RotationEpoch   1451545
	Obliquity       157
	EqAscendNode    -61.9

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.5
	BrightnessReal  1.5

	Surface
	{
		Preset         "lercurnis_don.cfg"
		SurfStyle       0.0626
		Randomize      (0.382, 0.076, 0.809)
		detailScale     256
		tropicLatitude  0.366
		icecapLatitude  1
		mareDensity     0
		montesFraction  0
		dunesFraction   0
		hillsFraction   0
		hills2Fraction  0
		canyonsFraction 0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.98
		stripeFluct     0.977
		stripeTwist     2
		cycloneMagn     2.69
		cycloneFreq     0.797
		cycloneDensity  0.35
		cycloneOctaves  0
		BumpHeight      18.6
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0.07
		RingsWinter     0.999
		ModulateBright  0
	}

	NoOcean         true

	Clouds
	{
		Height          0.0996
		Velocity        -1.88e+03
		BumpHeight      5.61
		Gamma           0.667
		Hapke           0.489
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     1
		ModulateBright  1
		Opacity         0.718
		mainFreq        2.4
		mainOctaves     15
		Coverage        0.29
		stripeZones     2.98
		stripeFluct     0.977
		stripeTwist     2
	}

	Clouds
	{
		Height          0.0996
		Velocity        1.78e+03
		BumpHeight      5.61
		Gamma           0.667
		Hapke           0.382
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		SubsurfScatBright 1
		RingsWinter     0.999
		ModulateBright  10
		mainFreq        2.4
		mainOctaves     15
		Coverage        0.29
		stripeZones     2.98
		stripeFluct     0.977
		stripeTwist     2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Don"
		Height          450
		Density         2.72e+03
		Pressure        8.38e+04
		Bright          3
		Opacity         1
		SkyLight        1
		Hue             0
		Saturation      1

		Composition
		{
			H2        	92.7
			He        	6.95
			CH4       	0.302
			N2        	0.0312
			NH3       	0.0238
			O2        	0.00719
			C2H2      	0.00308
			C2H4      	0.00127
			Ne        	0.00107
			Ar        	0.00077
			C2H6      	0.000495
			C3H8      	0.000327
			C8H18     	0.00026
			H2O       	2.65e-06
			H2S       	1.58e-06
			CO2       	1.52e-06
			Kr        	4.12e-07
			Xe        	3.35e-08
			SO2       	8.64e-09
			CO        	3.37e-10
			Cl2       	2.64e-10
		}
	}

	Climate
	{
		GlobalWindSpeed  13.8
	}

	Aurora
	{
		Height         400
		NorthLat       90
		NorthLon       0
		NorthRadius    1.08e+04
		NorthWidth     1.64e+03
		NorthRings     4
		NorthBright    1
		NorthFlashFreq 70.5
		NorthMoveSpeed 1.17
		NorthParticles 100000
		SouthLat       -90
		SouthLon       0
		SouthRadius    1.08e+04
		SouthWidth     1.64e+03
		SouthRings     4
		SouthBright    1
		SouthFlashFreq 59.3
		SouthMoveSpeed 1.39
		SouthParticles 100000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          368.534705
		SemiMajorAxis   47.8120182
		Eccentricity    0.0610687023
		Inclination     -2
		AscendingNode   -13.740458
		ArgOfPericenter -173.129771
		MeanAnomaly     -211.603053
	}
}

