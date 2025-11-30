Planet	"Chonk/Lercurnis B II"
{
	ParentBody     "Kond"
	Class          "Neptune"
	Mass            0.247999996
	Radius          7650
	InertiaMoment   0.236000001
	Oblateness      0.00325999991
	Obliquity       1
	EqAscendNode    84.49172
	TidalLocked     true

	AbsMagn         -4.2
	SlopeParam      5.05
	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.5
	BrightnessReal  1.5

	Surface
	{
		Preset         "lercurnis_kond_chonk.cfg"
		SurfStyle       0.362
		Randomize      (0.718, 0.152, -0.306)
		detailScale     256
		tropicLatitude  0
		icecapLatitude  0.9
		mareDensity     0
		montesFraction  0
		dunesFraction   0
		hillsFraction   0
		hills2Fraction  0
		canyonsFraction 0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 0
		volcanoTemp     1.79e+03
		lavaCoverTidal  0
		lavaCoverSun    0.334
		lavaCoverYoung  0
		stripeZones     0.992
		stripeFluct     2
		stripeTwist     5
		cycloneMagn     2.62
		cycloneFreq     0.585
		cycloneDensity  0.402
		cycloneOctaves  0
		BumpHeight      20
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  0
	}

	NoOcean         true

	Clouds
	{
		Height          0.1
		Velocity        2.56e+03
		BumpHeight      1.91
		Gamma           0.824
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.206
		mainOctaves     15
		Coverage        0.503
		stripeZones     0.992
		stripeFluct     2
		stripeTwist     5
		TidalLocked     true
	}

	Clouds
	{
		Height          0.1
		Velocity        1.21e+03
		BumpHeight      1.39
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.7
		mainFreq        0.206
		mainOctaves     15
		Coverage        0.503
		stripeZones     0.992
		stripeFluct     2
		stripeTwist     5
		TidalLocked     true
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Kond Chonk"
		Height          400
		Density         522
		Pressure        1870
		Bright          3
		Opacity         1
		SkyLight        1
		Hue             0
		Saturation      1

		Composition
		{
			H2O       	90
			N2        	9
			CO2       	1
			O2        	1e-05
		}
	}

	Climate
	{
		GlobalWindSpeed  20.9
	}

	Aurora
	{
		Height         108
		NorthLat       60
		NorthLon       0
		NorthRadius    8.05e+03
		NorthWidth     8.05e+03
		NorthRings     4
		NorthBright    0.437
		NorthFlashFreq 7.82
		NorthMoveSpeed 100
		NorthParticles 1000
		SouthLat       -60
		SouthLon       180
		SouthRadius    8.05e+03
		SouthWidth     8.05e+03
		SouthRings     4
		SouthBright    0.2
		SouthFlashFreq 4.61
		SouthMoveSpeed 100
		SouthParticles 4000
		TopColor    (0.914 0.772 0.528)
		BottomColor (0.308 0.750 0.335)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0050373424
		SemiMajorAxis   0.0144942311
		Eccentricity    0.0305343511
		Inclination     1
		AscendingNode   84.49172
		ArgOfPericenter -145.648855
		MeanAnomaly     1
	}
}

