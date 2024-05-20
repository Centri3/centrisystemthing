Planet	"Oktdek/Caecus III"
{
	ParentBody     "Oblitus es"
	Class          "Jupiter"
	Mass            317.83
	Radius          7.19e+04
	InertiaMoment   0.242
	RotationPeriod  240
	RotationEpoch   1451545
	Obliquity       2
	EqAscendNode    35.7

	EndogenousHeating 0.0102
	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.5
	BrightnessReal  1.5

	Interior
	{
		Composition
		{
			Hydrogen    87.42
			Helium      9.44
			Ices		3.0
			Silicates	0.1
			Metals      0.04
		}
	}

	Surface
	{
		Preset         "caecus_oktdek.cfg"
		SurfStyle       0.652
		Randomize      (-0.626, 0.250, -0.924)
		detailScale     256
		tropicLatitude  0.0608
		icecapLatitude  0.961
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
		stripeZones     3.82
		stripeFluct     0.931
		stripeTwist     1.37
		cycloneMagn     1.22
		cycloneFreq     2
		cycloneDensity  1
		cycloneOctaves  4
		cycloneMagn2     0.2
		cycloneFreq2     0.198
		cycloneLatitude2 0
		cycloneOctaves2  0
		BumpHeight      12.7
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
		Height          0.102
		Velocity        1.03e+03
		BumpHeight      4.37
		Gamma           0.4
		Hapke           0
		SpotBright      0
		SpotWidth       0.03
		DayAmbient      0
		ModulateBright  2
		Opacity         0.748
		mainFreq        1.47
		mainOctaves     15
		Coverage        0.125
		stripeZones     3.82
		stripeFluct     0.931
		stripeTwist     1.37
	}

	Clouds
	{
		Height          0.102
		Velocity        2.64e+03
		BumpHeight      10
		Gamma           0.6
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  2
		mainFreq        1.47
		mainOctaves     15
		Coverage        0.125
		stripeZones     3.82
		stripeFluct     0.931
		stripeTwist     1.37
	}

	NoLava          true

	Atmosphere
	{
		Model          "Externia"
		Height          250
		Density         1e+04
		Pressure        1e+06
		Bright          4
		Opacity         0.1
		SkyLight        1
		Hue             0
		Saturation      1

		Composition
		{
			H2        	90.1
			He        	6.02
			CH4       	2.73
			C3H8      	0.314
			C2H2      	0.305
			C8H18     	0.303
			C2H4      	0.112
			C2H6      	0.0538
			N2        	0.0391
			NH3       	0.0286
			O2        	0.00669
			Ne        	0.0011
			Ar        	0.000896
			CO2       	0.000154
			H2S       	1.7e-06
			Kr        	4.05e-07
			H2O       	2.94e-07
			Xe        	3.87e-08
			CO        	3.56e-08
			SO2       	1.01e-08
			Cl2       	2.96e-10
		}
	}

	Climate
	{
		GlobalWindSpeed  10
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          38.6270211
		SemiMajorAxis   9.36768566
		Eccentricity    0.05
		Inclination     0.671346435
		AscendingNode   129.160305
		ArgOfPericenter -184.122137
		MeanAnomaly     255.572519
	}
}

