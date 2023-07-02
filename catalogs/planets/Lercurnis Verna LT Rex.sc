DwarfPlanet	"Rex/Lercurnis I LT.1"
{
	ParentBody     "Fragmunt-Kond bar"
	Class          "Aquaria"
	Mass            0.0078871
	Radius          1560
	InertiaMoment   0.37992
	Oblateness      0.0020808
	RotationPeriod  178.01
	RotationEpoch   1451545
	Obliquity       68.702
	EqAscendNode    11.425

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_verna_lt_rex.cfg"
		SurfStyle       0.71697
		Randomize      (-0.772, 0.778, -0.436)
		colorDistMagn   0.079919
		colorDistFreq   272.9
		detailScale     128
		drivenDarkening 0
		seaLevel        0.58015
		snowLevel       0.64885
		tropicLatitude  0.021862
		icecapLatitude  0.77863
		icecapHeight    0
		climatePole     1
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.47085
		heightTempGrad  0.625
		beachWidth      0.0014041
		tropicWidth     0.07
		mainFreq        2.6718
		venusFreq       0.82985
		venusMagn       0.22901
		mareFreq        1.0018
		mareDensity     0.14464
		terraceProb     0.19943
		erosion         0
		montesMagn      0
		montesFreq      25
		montesSpiky     0.44275
		montesFraction  1
		dunesMagn       0.036153
		dunesFreq       0
		dunesFraction   0.59445
		hillsMagn       0.05
		hillsFreq       500
		hillsFraction   1
		hills2Fraction  1
		riversMagn      12.977
		riversFreq      2.9008
		riversSin       6.4885
		riftsMagn       0
		riftsFreq       3.057
		riftsSin        4.1445
		canyonsMagn     0.53222
		canyonsFreq     0.74168
		canyonsFraction 0
		cracksMagn      0
		cracksFreq      15
		cracksOctaves   15
		craterMagn      3
		craterFreq      2
		craterDensity   1
		craterOctaves   6
		craterRayedFactor 0
		volcanoMagn     0.26955
		volcanoFreq     0.60553
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.13222
		volcanoRadius   0.22641
		volcanoTemp     264.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.7653
		stripeTwist     0.39039
		cycloneMagn     0.84837
		cycloneFreq     0.92786
		cycloneDensity  0.36495
		cycloneOctaves  0
		BumpHeight      20.2
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.1
		RoughnessWater  0.39877
		RoughnessIce    0.23371
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.7
		SpotBright      1.5193
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          11.112
		Velocity        45
		BumpHeight      0.85369
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0
		ModulateBright  1
		Opacity         0.73282
		mainFreq        0.84733
		mainOctaves     0
		Coverage        0.51908
		stripeZones     1.7653
		stripeTwist     0.39039
	}

	Clouds
	{
		Height          11.112
		Velocity        30
		BumpHeight      1.1714
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0.9565
		ModulateBright  1
		Opacity         0.65649
		mainFreq        0.84733
		mainOctaves     0
		Coverage        0.51908
		stripeZones     1.7653
		stripeTwist     0.39039
	}

	Clouds
	{
		Height          11.112
		Velocity        15
		BumpHeight      0.76824
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0.9565
		ModulateBright  1
		Opacity         0.65649
		mainFreq        0.84733
		mainOctaves     0
		Coverage        0.51908
		stripeZones     1.7653
		stripeTwist     0.39039
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Verna LT Rex"
		Height          209.22
		Density         2.4802
		Pressure        0.65108
		Greenhouse      76.336
		Bright          10
		Opacity         0.53435
		SkyLight        3.3333
		Hue             0
		Saturation      1

		Composition
		{
			N2        	99.707
			C2H6      	0.12076
			CH4       	0.10269
			C2H4      	0.051999
			CO        	0.0163
			C2H2      	0.00041774
			Ar        	0.00023371
			O2        	0.00022787
			CO2       	0.00019913
			Ne        	0.00013737
			NH3       	2.5344e-05
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          105.29563
		SemiMajorAxis   20.7411429
		Eccentricity    0.152671756
		Inclination     -2
		AscendingNode   -123.664122
		ArgOfPericenter 123.664122
		MeanAnomaly     50
	}
}

